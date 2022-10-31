package dev.bogibek.justextractframes.decoder.handler

import dev.bogibek.justextractframes.decoder.Frame

interface IVideoFrameExtractor {
    fun onCurrentFrameExtracted(currentFrame: Frame)
    fun onAllFrameExtracted(processedFrameCount: Int, processedTimeMs: Long)
}