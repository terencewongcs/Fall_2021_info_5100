package edu.northeastern.yanxuan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Netflix {
    List<Genre> genreList;

    public Genre getGenre(String genreName) {
        ArrayList<Genre> filter = (ArrayList<Genre>) genreList.stream()
                .filter(section -> section.getGenreName().equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if (filter.size() == 0) {
            return null;
        }
        return filter.get(0);
    }
}