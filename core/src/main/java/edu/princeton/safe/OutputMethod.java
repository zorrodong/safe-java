package edu.princeton.safe;

import java.util.List;

public interface OutputMethod {

    void apply(List<NodePair> distances,
               double maximumDistanceThreshold,
               List<? extends Neighborhood> neighborhoods,
               List<FunctionalAttribute> attributes,
               List<FunctionalGroup> groups);

}
