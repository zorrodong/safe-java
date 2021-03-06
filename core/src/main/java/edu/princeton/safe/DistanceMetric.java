package edu.princeton.safe;

import java.util.List;

import edu.princeton.safe.model.Neighborhood;

public interface DistanceMetric extends Identifiable {

    <T extends Neighborhood> List<T> computeDistances(NetworkProvider networkProvider,
                                                      NeighborhoodFactory<T> neighborhoodFactory);

}
