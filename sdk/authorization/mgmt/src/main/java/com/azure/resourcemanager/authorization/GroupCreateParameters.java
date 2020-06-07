// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The GroupCreateParameters model. */
@Fluent
public final class GroupCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GroupCreateParameters.class);

    /*
     * Group display name
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Whether the group is mail-enabled. Must be false. This is because only
     * pure security groups can be created using the Graph API.
     */
    @JsonProperty(value = "mailEnabled", required = true)
    private boolean mailEnabled;

    /*
     * Mail nickname
     */
    @JsonProperty(value = "mailNickname", required = true)
    private String mailNickname;

    /*
     * Whether the group is a security group. Must be true. This is because
     * only pure security groups can be created using the Graph API.
     */
    @JsonProperty(value = "securityEnabled", required = true)
    private boolean securityEnabled;

    /*
     * Request parameters for creating a new group.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of GroupCreateParameters class. */
    public GroupCreateParameters() {
        mailEnabled = false;
        securityEnabled = true;
    }

    /**
     * Get the displayName property: Group display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Group display name.
     *
     * @param displayName the displayName value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the mailEnabled property: Whether the group is mail-enabled. Must be false. This is because only pure
     * security groups can be created using the Graph API.
     *
     * @return the mailEnabled value.
     */
    public boolean mailEnabled() {
        return this.mailEnabled;
    }

    /**
     * Set the mailEnabled property: Whether the group is mail-enabled. Must be false. This is because only pure
     * security groups can be created using the Graph API.
     *
     * @param mailEnabled the mailEnabled value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withMailEnabled(boolean mailEnabled) {
        this.mailEnabled = mailEnabled;
        return this;
    }

    /**
     * Get the mailNickname property: Mail nickname.
     *
     * @return the mailNickname value.
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname property: Mail nickname.
     *
     * @param mailNickname the mailNickname value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the securityEnabled property: Whether the group is a security group. Must be true. This is because only pure
     * security groups can be created using the Graph API.
     *
     * @return the securityEnabled value.
     */
    public boolean securityEnabled() {
        return this.securityEnabled;
    }

    /**
     * Set the securityEnabled property: Whether the group is a security group. Must be true. This is because only pure
     * security groups can be created using the Graph API.
     *
     * @param securityEnabled the securityEnabled value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withSecurityEnabled(boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for creating a new group.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for creating a new group.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GroupCreateParameters object itself.
     */
    public GroupCreateParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model GroupCreateParameters"));
        }
        if (mailNickname() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property mailNickname in model GroupCreateParameters"));
        }
    }
}