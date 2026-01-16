package Topic11_Thread_Safety;

public class ThreadSafety {
    /*
    Question:
            When does anything become thread safe?

    Answer:
          When multiple threads are trying to access the system(resource),
          and unexpected result,or race condition or data corruption,
          is not there yet ... , does not happening .
          Then we can say this is thread safe ...

     */
    /*
    Thread Safety (Java):-
    Thread safety means a program behaves correctly when multiple threads access shared data at the same time.
    A thread-safe code prevents race conditions, data inconsistency, and unexpected results.

    Why Thread Safety Is Needed:-
    When multiple threads modify the same variable without control, results become unpredictable.
     */
}
