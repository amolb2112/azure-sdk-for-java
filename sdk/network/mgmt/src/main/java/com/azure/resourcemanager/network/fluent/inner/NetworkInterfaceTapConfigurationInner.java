// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NetworkInterfaceTapConfiguration model. */
@JsonFlatten
@Fluent
public class NetworkInterfaceTapConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceTapConfigurationInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Sub Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The reference of the Virtual Network Tap resource.
     */
    @JsonProperty(value = "properties.virtualNetworkTap")
    private VirtualNetworkTapInner virtualNetworkTap;

    /*
     * The provisioning state of the network interface tap configuration.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Sub Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the virtualNetworkTap property: The reference of the Virtual Network Tap resource.
     *
     * @return the virtualNetworkTap value.
     */
    public VirtualNetworkTapInner virtualNetworkTap() {
        return this.virtualNetworkTap;
    }

    /**
     * Set the virtualNetworkTap property: The reference of the Virtual Network Tap resource.
     *
     * @param virtualNetworkTap the virtualNetworkTap value to set.
     * @return the NetworkInterfaceTapConfigurationInner object itself.
     */
    public NetworkInterfaceTapConfigurationInner withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        this.virtualNetworkTap = virtualNetworkTap;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface tap configuration. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkTap() != null) {
            virtualNetworkTap().validate();
        }
    }
}