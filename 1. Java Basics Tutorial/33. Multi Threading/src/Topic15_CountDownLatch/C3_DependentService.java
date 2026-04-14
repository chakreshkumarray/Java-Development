package Topic15_CountDownLatch;

import java.util.concurrent.Callable;

public class C3_DependentService implements Callable<String> {
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+ " Service started..");
        Thread.sleep(2000);
        return "ck";
    }
}
/*
🔹 What is a C1_Dependent Service?
 A dependent service means:

One task/service depends on the result of another
It cannot start or complete until the required task finishes

🔹 Simple Example
Service A → Fetch user data
Service B → Process user data

👉 Service B depends on Service A

🔹 Problem Without Handling Dependency ❌
Service B may run before A completes
Leads to:
null values
 */
