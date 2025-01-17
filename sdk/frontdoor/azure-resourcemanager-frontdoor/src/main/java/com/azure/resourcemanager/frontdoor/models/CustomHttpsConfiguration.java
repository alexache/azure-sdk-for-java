// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontDoorCertificateSourceParameters;
import com.azure.resourcemanager.frontdoor.fluent.models.KeyVaultCertificateSourceParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Https settings for a domain. */
@Fluent
public final class CustomHttpsConfiguration {
    /*
     * Defines the source of the SSL certificate
     */
    @JsonProperty(value = "certificateSource", required = true)
    private FrontDoorCertificateSource certificateSource;

    /*
     * Defines the TLS extension protocol that is used for secure delivery
     */
    @JsonProperty(value = "protocolType", required = true)
    private FrontDoorTlsProtocolType protocolType;

    /*
     * The minimum TLS version required from the clients to establish an SSL handshake with Front Door.
     */
    @JsonProperty(value = "minimumTlsVersion", required = true)
    private MinimumTlsVersion minimumTlsVersion;

    /*
     * KeyVault certificate source parameters (if certificateSource=AzureKeyVault)
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters")
    private KeyVaultCertificateSourceParameters innerKeyVaultCertificateSourceParameters;

    /*
     * Parameters required for enabling SSL with Front Door-managed certificates (if certificateSource=FrontDoor)
     */
    @JsonProperty(value = "frontDoorCertificateSourceParameters")
    private FrontDoorCertificateSourceParameters innerFrontDoorCertificateSourceParameters;

    /** Creates an instance of CustomHttpsConfiguration class. */
    public CustomHttpsConfiguration() {
    }

    /**
     * Get the certificateSource property: Defines the source of the SSL certificate.
     *
     * @return the certificateSource value.
     */
    public FrontDoorCertificateSource certificateSource() {
        return this.certificateSource;
    }

    /**
     * Set the certificateSource property: Defines the source of the SSL certificate.
     *
     * @param certificateSource the certificateSource value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateSource(FrontDoorCertificateSource certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * Get the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @return the protocolType value.
     */
    public FrontDoorTlsProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     *
     * @param protocolType the protocolType value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withProtocolType(FrontDoorTlsProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the innerKeyVaultCertificateSourceParameters property: KeyVault certificate source parameters (if
     * certificateSource=AzureKeyVault).
     *
     * @return the innerKeyVaultCertificateSourceParameters value.
     */
    private KeyVaultCertificateSourceParameters innerKeyVaultCertificateSourceParameters() {
        return this.innerKeyVaultCertificateSourceParameters;
    }

    /**
     * Get the innerFrontDoorCertificateSourceParameters property: Parameters required for enabling SSL with Front
     * Door-managed certificates (if certificateSource=FrontDoor).
     *
     * @return the innerFrontDoorCertificateSourceParameters value.
     */
    private FrontDoorCertificateSourceParameters innerFrontDoorCertificateSourceParameters() {
        return this.innerFrontDoorCertificateSourceParameters;
    }

    /**
     * Get the vault property: The Key Vault containing the SSL certificate.
     *
     * @return the vault value.
     */
    public KeyVaultCertificateSourceParametersVault vault() {
        return this.innerKeyVaultCertificateSourceParameters() == null
            ? null
            : this.innerKeyVaultCertificateSourceParameters().vault();
    }

    /**
     * Set the vault property: The Key Vault containing the SSL certificate.
     *
     * @param vault the vault value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withVault(KeyVaultCertificateSourceParametersVault vault) {
        if (this.innerKeyVaultCertificateSourceParameters() == null) {
            this.innerKeyVaultCertificateSourceParameters = new KeyVaultCertificateSourceParameters();
        }
        this.innerKeyVaultCertificateSourceParameters().withVault(vault);
        return this;
    }

    /**
     * Get the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.innerKeyVaultCertificateSourceParameters() == null
            ? null
            : this.innerKeyVaultCertificateSourceParameters().secretName();
    }

    /**
     * Set the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretName the secretName value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretName(String secretName) {
        if (this.innerKeyVaultCertificateSourceParameters() == null) {
            this.innerKeyVaultCertificateSourceParameters = new KeyVaultCertificateSourceParameters();
        }
        this.innerKeyVaultCertificateSourceParameters().withSecretName(secretName);
        return this;
    }

    /**
     * Get the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.innerKeyVaultCertificateSourceParameters() == null
            ? null
            : this.innerKeyVaultCertificateSourceParameters().secretVersion();
    }

    /**
     * Set the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretVersion(String secretVersion) {
        if (this.innerKeyVaultCertificateSourceParameters() == null) {
            this.innerKeyVaultCertificateSourceParameters = new KeyVaultCertificateSourceParameters();
        }
        this.innerKeyVaultCertificateSourceParameters().withSecretVersion(secretVersion);
        return this;
    }

    /**
     * Get the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @return the certificateType value.
     */
    public FrontDoorCertificateType certificateType() {
        return this.innerFrontDoorCertificateSourceParameters() == null
            ? null
            : this.innerFrontDoorCertificateSourceParameters().certificateType();
    }

    /**
     * Set the certificateType property: Defines the type of the certificate used for secure connections to a
     * frontendEndpoint.
     *
     * @param certificateType the certificateType value to set.
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateType(FrontDoorCertificateType certificateType) {
        if (this.innerFrontDoorCertificateSourceParameters() == null) {
            this.innerFrontDoorCertificateSourceParameters = new FrontDoorCertificateSourceParameters();
        }
        this.innerFrontDoorCertificateSourceParameters().withCertificateType(certificateType);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateSource in model CustomHttpsConfiguration"));
        }
        if (protocolType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocolType in model CustomHttpsConfiguration"));
        }
        if (minimumTlsVersion() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property minimumTlsVersion in model CustomHttpsConfiguration"));
        }
        if (innerKeyVaultCertificateSourceParameters() != null) {
            innerKeyVaultCertificateSourceParameters().validate();
        }
        if (innerFrontDoorCertificateSourceParameters() != null) {
            innerFrontDoorCertificateSourceParameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomHttpsConfiguration.class);
}
