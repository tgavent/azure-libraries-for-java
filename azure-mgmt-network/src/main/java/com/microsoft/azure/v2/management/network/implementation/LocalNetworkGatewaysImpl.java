/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.LocalNetworkGateway;
import com.microsoft.azure.v2.management.network.LocalNetworkGateways;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.implementation.GroupPagedList;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;

import java.util.List;

/**
 *  Implementation for LocalNetworkGateways.
 */
@LangDefinition
class LocalNetworkGatewaysImpl
        extends GroupableResourcesImpl<
        LocalNetworkGateway,
        LocalNetworkGatewayImpl,
        LocalNetworkGatewayInner,
        LocalNetworkGatewaysInner,
        NetworkManager>
        implements LocalNetworkGateways {

    LocalNetworkGatewaysImpl(final NetworkManager networkManager) {
        super(networkManager.inner().localNetworkGateways(), networkManager);
    }

    @Override
    public LocalNetworkGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public PagedList<LocalNetworkGateway> list() {
        return new GroupPagedList<LocalNetworkGateway>(this.manager().resourceManager().resourceGroups().list()) {
            @Override
            public List<LocalNetworkGateway> listNextGroup(String resourceGroupName) {
                return wrapList(LocalNetworkGatewaysImpl.this.inner().listByResourceGroup(resourceGroupName));
            }
        };
    }

    @Override
    public Observable<LocalNetworkGateway> listAsync() {
        return this.manager().resourceManager().resourceGroups().listAsync()
                .flatMap(resourceGroup -> wrapPageAsync(inner().listByResourceGroupAsync(resourceGroup.name())));
    }

    @Override
    public PagedList<LocalNetworkGateway> listByResourceGroup(String groupName) {
        return wrapList(this.inner().listByResourceGroup(groupName));
    }

    @Override
    public Observable<LocalNetworkGateway> listByResourceGroupAsync(String groupName) {
        return wrapPageAsync(this.inner().listByResourceGroupAsync(groupName));
    }

    @Override
    protected Maybe<LocalNetworkGatewayInner> getInnerAsync(String groupName, String name) {
        return this.inner().getByResourceGroupAsync(groupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name)
                .flatMapCompletable(o -> Completable.complete());
    }

    // Fluent model create helpers

    @Override
    protected LocalNetworkGatewayImpl wrapModel(String name) {
        LocalNetworkGatewayInner inner = new LocalNetworkGatewayInner();

        return new LocalNetworkGatewayImpl(name, inner, super.manager());
    }

    @Override
    protected LocalNetworkGatewayImpl wrapModel(LocalNetworkGatewayInner inner) {
        if (inner == null) {
            return null;
        }
        return new LocalNetworkGatewayImpl(inner.name(), inner, this.manager());
    }
}

