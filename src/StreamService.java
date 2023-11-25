import java.util.ArrayList;
import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }

    public List<Stream> createStreamList (Stream stream) {
        List<Stream> streams = new ArrayList<>();
        return streams;
    }

    public List<Stream> addToStreamList (List<Stream> streams, Stream stream) {
        streams.add(stream);
        return streams;
    }
}

