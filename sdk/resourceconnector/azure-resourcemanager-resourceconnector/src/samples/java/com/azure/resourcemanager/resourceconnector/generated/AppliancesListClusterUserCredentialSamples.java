// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.Context;

/** Samples for Appliances ListClusterUserCredential. */
public final class AppliancesListClusterUserCredentialSamples {
    /*
     * x-ms-original-file: specification/resourceconnector/resource-manager/Microsoft.ResourceConnector/preview/2022-04-15-preview/examples/AppliancesListClusterUserCredential.json
     */
    /**
     * Sample code: ListClusterUserCredentialAppliance.
     *
     * @param manager Entry point to AppliancesManager.
     */
    public static void listClusterUserCredentialAppliance(
        com.azure.resourcemanager.resourceconnector.AppliancesManager manager) {
        manager.appliances().listClusterUserCredentialWithResponse("testresourcegroup", "appliance01", Context.NONE);
    }
}