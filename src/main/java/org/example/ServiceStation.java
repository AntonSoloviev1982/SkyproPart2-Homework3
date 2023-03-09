package org.example;

public class ServiceStation {

    public void check(Transport[] transports) {
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] != null) {
                transports[i].updateTyre();
            }
        }
    }

}



