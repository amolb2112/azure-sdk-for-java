// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PhoneNumberOperation model. */
@Immutable
public final class PhoneNumberOperation {
    /*
     * Status of operation.
     */
    @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private PhoneNumberOperationStatus status;

    /*
     * URL for retrieving the result of the operation, if any.
     */
    @JsonProperty(value = "resourceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceLocation;

    /*
     * The date that the operation was created.
     */
    @JsonProperty(value = "createdDateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDateTime;

    /*
     * The Communication Services error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private CommunicationError error;

    /*
     * Id of operation.
     */
    @JsonProperty(value = "id", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The type of operation, e.g. Search
     */
    @JsonProperty(value = "operationType", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private PhoneNumberOperationType operationType;

    /*
     * The most recent date that the operation was changed.
     */
    @JsonProperty(value = "lastActionDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastActionDateTime;

    /**
     * Get the status property: Status of operation.
     *
     * @return the status value.
     */
    public PhoneNumberOperationStatus getStatus() {
        return this.status;
    }

    /**
     * Get the resourceLocation property: URL for retrieving the result of the operation, if any.
     *
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Get the createdDateTime property: The date that the operation was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the error property: The Communication Services error.
     *
     * @return the error value.
     */
    public CommunicationError getError() {
        return this.error;
    }

    /**
     * Get the id property: Id of operation.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the operationType property: The type of operation, e.g. Search.
     *
     * @return the operationType value.
     */
    public PhoneNumberOperationType getOperationType() {
        return this.operationType;
    }

    /**
     * Get the lastActionDateTime property: The most recent date that the operation was changed.
     *
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime getLastActionDateTime() {
        return this.lastActionDateTime;
    }
}
