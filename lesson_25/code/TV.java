package code;
/*
создать класс TV
- производитель
- размер

 */
public class TV {
    private String manufacturer;
    private Integer size;

    public TV(String manufacturer, Integer size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public String getProducer() {
        return manufacturer;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}


