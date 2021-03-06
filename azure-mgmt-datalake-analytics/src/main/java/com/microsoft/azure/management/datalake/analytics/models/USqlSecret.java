/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL secret item.
 */
public class USqlSecret extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the secret.
     */
    @JsonProperty(value = "secretName")
    private String name;

    /**
     * the creation time of the credential object. This is the only information
     * returned about a secret from a GET.
     */
    @JsonProperty(value = "creationTime")
    private DateTime creationTime;

    /**
     * the URI identifier for the secret in the format
     * &lt;hostname&gt;:&lt;port&gt;.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /**
     * the password for the secret to pass in.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlSecret object itself.
     */
    public USqlSecret withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the secret.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the secret.
     *
     * @param name the name value to set
     * @return the USqlSecret object itself.
     */
    public USqlSecret withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the creation time of the credential object. This is the only information returned about a secret from a GET.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creation time of the credential object. This is the only information returned about a secret from a GET.
     *
     * @param creationTime the creationTime value to set
     * @return the USqlSecret object itself.
     */
    public USqlSecret withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the URI identifier for the secret in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the URI identifier for the secret in the format &lt;hostname&gt;:&lt;port&gt;.
     *
     * @param uri the uri value to set
     * @return the USqlSecret object itself.
     */
    public USqlSecret withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the password for the secret to pass in.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password for the secret to pass in.
     *
     * @param password the password value to set
     * @return the USqlSecret object itself.
     */
    public USqlSecret withPassword(String password) {
        this.password = password;
        return this;
    }

}
