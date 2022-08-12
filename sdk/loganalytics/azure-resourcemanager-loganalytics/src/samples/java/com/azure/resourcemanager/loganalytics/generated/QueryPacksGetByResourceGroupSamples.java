// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for QueryPacks GetByResourceGroup. */
public final class QueryPacksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2019-09-01/examples/QueryPacksGet.json
     */
    /**
     * Sample code: QueryPackGet.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void queryPackGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.queryPacks().getByResourceGroupWithResponse("my-resource-group", "my-querypack", Context.NONE);
    }
}