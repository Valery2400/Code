package homework_32.task1.task1;

public class TeaProducer {

    private String producerName;

    public TeaProducer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return "TeaProducer{" +
                "producerName='" + producerName + '\'' +
                '}';
    }
}
