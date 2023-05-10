import java.util.List;

public class Smartphone implements Callable,Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse(String url) {

        return String.format("Browsing: %s",url);
    }

    @Override
    public String call(String number) {

        return String.format("Calling... %s",number);
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }
}
