package com.github.tsingjyujing.geo.basic.operations

/**
  * Object which can get jaccard similarity and distance
  *
  * @tparam T
  */
trait Jaccardable[T <: Jaccardable[T]] {

    def jaccardSimilarity(x: T): Double

    /**
      * Auto get a fake distance by similarity
      *
      * @param x
      * @return
      */
    def jaccardDistance(x: T): Double = {
        val simVal = jaccardSimilarity(x)
        math.exp(-simVal * simVal)
    }
}

object Jaccardable {
    def commonJaccard[U](s1: Set[U], s2: Set[U]): Double = (s1 intersect s2).size * 1.0 / (s1 union s2).size
}