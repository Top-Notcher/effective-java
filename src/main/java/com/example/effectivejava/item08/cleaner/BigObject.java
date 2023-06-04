package com.example.effectivejava.item08.cleaner;

import java.util.List;

public class BigObject {

    private List<Object> resource;

    public BigObject(List<Object> resource) {
        this.resource = resource;
    }

    public static class ResourceCleaner implements Runnable {   // static으로 만들고 BigObject에 대한 레퍼런스가 있어서는 안된다. (객체가 다시 만들어질 수 있다)
        private List<Object> resourceToClean;

        public ResourceCleaner(List<Object> resourceToClean) {
            this.resourceToClean = resourceToClean;
        }

        @Override
        public void run() {
            resourceToClean = null;
            System.out.println("cleaned up.");
        }
    }
}
