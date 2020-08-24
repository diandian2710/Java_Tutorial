import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Function;

public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("in28minutes"), new CallableTask("Ranga"), new CallableTask("XihengWang"));

        List<Future<String>> results = executorService.invokeAll(tasks);

        for(Future<String> result:results){
            System.out.println(result.get());
        }
        executorService.shutdown();

    }
}
