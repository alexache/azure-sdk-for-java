// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for CustomEntityStoreAssignments ListByResourceGroup. */
public final class CustomEntityStoreAssignmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2021-07-01-preview/examples/CustomEntityStoreAssignments/customEntityStoreAssignmentListByResourceGroup_example.json
     */
    /**
     * Sample code: List custom entity store assignments in a subscription and a resource group.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listCustomEntityStoreAssignmentsInASubscriptionAndAResourceGroup(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.customEntityStoreAssignments().listByResourceGroup("TestResourceGroup", Context.NONE);
    }
}