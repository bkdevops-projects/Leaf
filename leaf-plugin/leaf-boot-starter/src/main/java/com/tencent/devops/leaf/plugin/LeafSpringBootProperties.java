package com.tencent.devops.leaf.plugin;

import com.tencent.devops.leaf.common.PropertyFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "leaf",ignoreUnknownFields = true)
public class LeafSpringBootProperties {
    private String name;
    private Segment segment;
    private Snowflake snowflake;
    public static class Segment{
        private boolean enable=false;
        private String allocStrategyDaoBeanName;
        private String url;
        private String username;
        private String password;

        public String getAllocStrategyDaoBeanName() {
            return allocStrategyDaoBeanName;
        }

        public void setAllocStrategyDaoBeanName(String allocStrategyDaoBeanName) {
            this.allocStrategyDaoBeanName = allocStrategyDaoBeanName;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isEnable() {
            return enable;
        }
        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        @Override
        public String toString() {
            return "Segment{" +
                    "enable=" + enable +
                    '}';
        }
    }
    public static class Snowflake{
        private boolean enable =false;
        private String address;
        private int port;
        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public boolean isEnable() {
            return enable;
        }
        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        @Override
        public String toString() {
            return "Snowflake{" +
                    "enable=" + enable +
                    '}';
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        PropertyFactory.setLeafName(name);
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public Snowflake getSnowflake() {
        return snowflake;
    }

    public void setSnowflake(Snowflake snowflake) {
        this.snowflake = snowflake;
    }

    @Override
    public String toString() {
        return "LeafSpringBootProperties{" +
                "name='" + name + '\'' +
                ", segment=" + segment +
                ", snowflake=" + snowflake +
                '}';
    }
}
