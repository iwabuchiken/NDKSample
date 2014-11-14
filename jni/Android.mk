LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := NDKSample
LOCAL_SRC_FILES := NDKSample.cpp

include $(BUILD_SHARED_LIBRARY)
