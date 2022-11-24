package org.shivam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

public class TaskManager<R, C> {

    private final List<BiConsumer<R, C>> tasks = new ArrayList<>();

    public void execute(R r, C c) {
        for (final BiConsumer<R, C> task : tasks) {
            task.accept(r, c);
        }
    }

    public List<CompletableFuture<Void>> execute(R r, C c, Executor executor) {
        List<CompletableFuture<Void>> futures = new ArrayList<>();
        for (final BiConsumer<R, C> task : tasks) {
            futures.add(CompletableFuture.runAsync(() -> task.accept(r, c), executor));
        }
        return futures;
    }

    public void register(BiConsumer<R, C> consumer) {
        tasks.add(consumer);
    }

}
