package com.thoughtworks.twu.intro;

import com.sun.tools.javac.util.Pair;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Utils {

    public static <A, B> Stream<Pair<A, B>> zip(Stream<A> as, Stream<B> bs)
    {
        Iterator<A> i=as.iterator();
        return bs.filter(x->i.hasNext()).map(b->new Pair<>(i.next(), b));
    }

}
