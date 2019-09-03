package com.sharry.lib.picturepicker;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;

import com.sharry.lib.camera.AspectRatio;
import com.sharry.lib.camera.SCameraView;

/**
 * @author Sharry <a href="sharrychoochn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-09-02
 */
public interface ITakerContract {

    interface IView {

        void setToolbarVisible(boolean visible);

        void setCameraViewVisible(boolean visible);

        void setRecordButtonVisible(boolean visible);

        void setVideoPlayerVisible(boolean visible);

        void setGrantedButtonVisible(boolean visible);

        void setDeniedButtonVisible(boolean visible);

        void setPicturePreviewVisible(boolean visible);

        void setPreviewAspect(@NonNull AspectRatio aspect);

        void setPreviewFullScreen(boolean fullScreen);

        void isSupportVideoRecord(boolean isVideoRecord);

        void setMaxRecordDuration(long maxDuration);

        void setRecordButtonProgress(long currentDuration);

        void startPreview();

        void startVideoPlayer(@NonNull String nextUri);

        void stopVideoPlayer();

        void setPreviewSource(@NonNull Bitmap bitmap);

        void toast(@NonNull String content);

        void notifyFileDeleted(String filePath);

        void setResult(@NonNull MediaMeta mediaMeta);

    }

    interface IPresenter {

        void handleGranted();

        void handleDenied();

        void handleTakePicture(Bitmap bitmap);

        void handleRecordStart(SCameraView cameraView);

        void handleRecordFinish();

        void release();
    }

}