/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that represents the operation.
 */
public class OperationDisplay {
    /**
     * Service provider: Microsoft.ServiceBus.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Resource on which the operation is performed: Invoice, etc.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Operation description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }
}
