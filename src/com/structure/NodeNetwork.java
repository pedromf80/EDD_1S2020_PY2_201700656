/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.structure;

/**
 *
 * @author pedro
 */
public class NodeNetwork {
    private LinkedList<NodeNet> listNodeNetwork;
    
    public NodeNetwork() {
        listNodeNetwork = new LinkedList<>();
    }
    
    public void add_node_network(String ip_network, String port){
        NodeNet newnode = new NodeNet(ip_network, port);
        listNodeNetwork.add_queue(newnode);
    }
    
       
    
    
    private class NodeNet {
        String ip_network;
        String port;

        public NodeNet(String ip_network, String port) {
            this.ip_network = ip_network;
            this.port = port;
        }

        public String getIp_network() {
            return ip_network;
        }

        public void setIp_network(String ip_network) {
            this.ip_network = ip_network;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }
        
        
    
        
        
    }

}
