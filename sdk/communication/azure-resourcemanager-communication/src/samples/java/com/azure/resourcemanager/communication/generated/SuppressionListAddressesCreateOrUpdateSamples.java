// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

/**
 * Samples for SuppressionListAddresses CreateOrUpdate.
 */
public final class SuppressionListAddressesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/communication/resource-manager/Microsoft.Communication/preview/2023-06-01-preview/examples/
     * suppressionLists/createOrUpdateAddress.json
     */
    /**
     * Sample code: CreateOrUpdate SuppressionListAddress resource.
     * 
     * @param manager Entry point to CommunicationManager.
     */
    public static void createOrUpdateSuppressionListAddressResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.suppressionListAddresses().define("11112222-3333-4444-5555-aaaabbbbcccc")
            .withExistingSuppressionList("contosoResourceGroup", "contosoEmailService", "contoso.com",
                "aaaa1111-bbbb-2222-3333-aaaa11112222")
            .withEmail("newuser1@fabrikam.com").withFirstName("updatedFirstName").create();
    }
}
