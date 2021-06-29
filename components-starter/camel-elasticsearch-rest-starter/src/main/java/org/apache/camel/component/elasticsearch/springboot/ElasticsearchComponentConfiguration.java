/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.elasticsearch.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.elasticsearch.client.RestClient;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send requests to ElasticSearch via REST API
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.elasticsearch-rest")
public class ElasticsearchComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the elasticsearch-rest component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * To use an existing configured Elasticsearch client, instead of creating a
     * client per endpoint. This allow to customize the client with specific
     * settings. The option is a org.elasticsearch.client.RestClient type.
     */
    private RestClient client;
    /**
     * The time in ms to wait before connection will timeout.
     */
    private Integer connectionTimeout = 30000;
    /**
     * Enable automatically discover nodes from a running Elasticsearch cluster
     */
    private Boolean enableSniffer = false;
    /**
     * Comma separated list with ip:port formatted remote transport addresses to
     * use. The ip and port options must be left blank for hostAddresses to be
     * considered instead.
     */
    private String hostAddresses;
    /**
     * The time in ms before retry
     */
    private Integer maxRetryTimeout = 30000;
    /**
     * The delay of a sniff execution scheduled after a failure (in
     * milliseconds)
     */
    private Integer sniffAfterFailureDelay = 60000;
    /**
     * The interval between consecutive ordinary sniff executions in
     * milliseconds. Will be honoured when sniffOnFailure is disabled or when
     * there are no failures between consecutive sniff executions
     */
    private Integer snifferInterval = 300000;
    /**
     * The timeout in ms to wait before the socket will timeout.
     */
    private Integer socketTimeout = 30000;
    /**
     * Enable SSL
     */
    private Boolean enableSSL = false;
    /**
     * Password for authenticate
     */
    private String password;
    /**
     * Basic authenticate user
     */
    private String user;

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public RestClient getClient() {
        return client;
    }

    public void setClient(RestClient client) {
        this.client = client;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Boolean getEnableSniffer() {
        return enableSniffer;
    }

    public void setEnableSniffer(Boolean enableSniffer) {
        this.enableSniffer = enableSniffer;
    }

    public String getHostAddresses() {
        return hostAddresses;
    }

    public void setHostAddresses(String hostAddresses) {
        this.hostAddresses = hostAddresses;
    }

    public Integer getMaxRetryTimeout() {
        return maxRetryTimeout;
    }

    public void setMaxRetryTimeout(Integer maxRetryTimeout) {
        this.maxRetryTimeout = maxRetryTimeout;
    }

    public Integer getSniffAfterFailureDelay() {
        return sniffAfterFailureDelay;
    }

    public void setSniffAfterFailureDelay(Integer sniffAfterFailureDelay) {
        this.sniffAfterFailureDelay = sniffAfterFailureDelay;
    }

    public Integer getSnifferInterval() {
        return snifferInterval;
    }

    public void setSnifferInterval(Integer snifferInterval) {
        this.snifferInterval = snifferInterval;
    }

    public Integer getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public Boolean getEnableSSL() {
        return enableSSL;
    }

    public void setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}