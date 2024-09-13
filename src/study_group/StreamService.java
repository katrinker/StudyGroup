package study_group;

import java.util.ArrayList;
import java.util.List;

public class StreamService {


    public void sortStreamsByGroupSize(List<Stream> streams) {
        List<Stream> streamList = new ArrayList<>(streams);
        streamList.sort(new StreamComparator());
    }

}
