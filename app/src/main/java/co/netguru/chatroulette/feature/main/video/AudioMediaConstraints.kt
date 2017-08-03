package co.netguru.chatroulette.feature.main.video

/**
 * @see <a href="https://chromium.googlesource.com/external/webrtc/+/master/webrtc/api/mediaconstraintsinterface.cc">
 *     Available constraints in media constraints interface implementation</a>
 */
enum class AudioMediaConstraints(override val constraintString: String) : WebRtcConstraint {

    AUDIO_ECHO_CANCELLATION_CONSTRAINT("googEchoCancellation"),
    AUDIO_AUTO_GAIN_CONTROL_CONSTRAINT("googAutoGainControl"),
    AUDIO_NOISE_SUPPRESSION_CONSTRAINT("googNoiseSuppression"),
    AUDIO_HIGH_PASS_FILTER_CONSTRAINT("googHighpassFilter"),
    AUDIO_TYPING_NOISE_DETECTION("googTypingNoiseDetection"),
    AUDIO_LEVEL_CONTROL_CONSTRAINT("levelControl");

}