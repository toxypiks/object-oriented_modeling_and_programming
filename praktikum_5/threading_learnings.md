### What you should know about threading with ExecutorService in Java

#### Basic knowledge

A threadpool is a group of a fixed number of reusable threads. You create tasks which describe what to do. You give the threadpool the tasks and the threadpool hands them over to the threads.

The ExecutorService is the threadpool. The threadpool has for example 10 threads. A task is a Runnable, Callable or CompletableFuture. The ExecutorService hands over the task to a thread. Within the thread the code of the task runs and completes. When a thread finished its task it returns the CompletableFuture and is free. When there are still tasks left to be done, the ExecuterService hands over another task to the same thread.

The CompletableFutures get returned immediately when task is finished. They get collected in a list (aufgabenErgebnisse.forEach(CompletableFuture::join);) till all are finished.

1. Creating a threadpool
   `final ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS)`

2. Create tasks (every Player is a task)
   `final Player[] aufgaben = createTasks();`

3. Starting a thread for every Player
   `final List<CompletableFuture<Player>> aufgabenErgebnisse = scheduleTasks(executorService, aufgaben)`

##### scheduleTasks
   - `CompletableFuture.supplyAsync(player::play, executorService);`
   - player::play defines what should happen in thread
   - executorService -> where should thread run
   - CompletableFuture -> promissed result when thread is ready

4. Waiting till all players are done
   `aufgabenErgebnisse.forEach(CompletableFuture::join)`

5. Collect all results
   `final Player[] result = combineResults(aufgabenErgebnise)`

6. Shutdown threadpool
   `executorService.shutdown();`

### Threads managed by OS

- the operating system (OS-scheduler) distributes the threads on the cores (not java!)
- for example 8 cores -> only 8 threads can run in parallel
- more threads then cores, context switching -> after a short time thread gets stopped by os and new thread gets pushed to core
- too much threads -> overhead -> too much context switching -> expensive
