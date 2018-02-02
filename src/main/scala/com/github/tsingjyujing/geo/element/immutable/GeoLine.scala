package com.github.tsingjyujing.geo.element.immutable

import com.github.tsingjyujing.geo.basic.{IGeoLine, IGeoPoint}

final case class GeoLine(pointStart: IGeoPoint, pointEnd: IGeoPoint) extends IGeoLine {
    val pointTuple: (IGeoPoint, IGeoPoint) = (pointStart, pointEnd)

    override def getTerminalPoints: (IGeoPoint, IGeoPoint) = pointTuple
}