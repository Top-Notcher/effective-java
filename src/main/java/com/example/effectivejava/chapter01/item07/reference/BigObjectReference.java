package com.example.effectivejava.chapter01.item07.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class BigObjectReference<BigObject> extends PhantomReference<BigObject> {

    /**
     * Creates a new phantom reference that refers to the given object and
     * is registered with the given queue.
     *
     * <p> It is possible to create a phantom reference with a {@code null}
     * queue, but such a reference is completely useless: Its {@code get}
     * method will always return {@code null} and, since it does not have a queue,
     * it will never be enqueued.
     *
     * @param referent the object the new phantom reference will refer to
     * @param q        the queue with which the reference is to be registered,
     *                 or {@code null} if registration is not required
     */
    public BigObjectReference(BigObject referent, ReferenceQueue<? super BigObject> q) {
        super(referent, q);
    }

    public void cleanUp() {
        System.out.println("clean up"); // 여기서 자원반납
    }
}
