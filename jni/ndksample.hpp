/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class ndk_main_MainActv */

#ifndef _Included_ndk_main_MainActv
#define _Included_ndk_main_MainActv
#ifdef __cplusplus
extern "C" {
#endif
#undef ndk_main_MainActv_MODE_PRIVATE
#define ndk_main_MainActv_MODE_PRIVATE 0L
#undef ndk_main_MainActv_MODE_WORLD_READABLE
#define ndk_main_MainActv_MODE_WORLD_READABLE 1L
#undef ndk_main_MainActv_MODE_WORLD_WRITEABLE
#define ndk_main_MainActv_MODE_WORLD_WRITEABLE 2L
#undef ndk_main_MainActv_MODE_APPEND
#define ndk_main_MainActv_MODE_APPEND 32768L
#undef ndk_main_MainActv_BIND_AUTO_CREATE
#define ndk_main_MainActv_BIND_AUTO_CREATE 1L
#undef ndk_main_MainActv_BIND_DEBUG_UNBIND
#define ndk_main_MainActv_BIND_DEBUG_UNBIND 2L
#undef ndk_main_MainActv_BIND_NOT_FOREGROUND
#define ndk_main_MainActv_BIND_NOT_FOREGROUND 4L
#undef ndk_main_MainActv_CONTEXT_INCLUDE_CODE
#define ndk_main_MainActv_CONTEXT_INCLUDE_CODE 1L
#undef ndk_main_MainActv_CONTEXT_IGNORE_SECURITY
#define ndk_main_MainActv_CONTEXT_IGNORE_SECURITY 2L
#undef ndk_main_MainActv_CONTEXT_RESTRICTED
#define ndk_main_MainActv_CONTEXT_RESTRICTED 4L
#undef ndk_main_MainActv_RESULT_CANCELED
#define ndk_main_MainActv_RESULT_CANCELED 0L
#undef ndk_main_MainActv_RESULT_OK
#define ndk_main_MainActv_RESULT_OK -1L
#undef ndk_main_MainActv_RESULT_FIRST_USER
#define ndk_main_MainActv_RESULT_FIRST_USER 1L
#undef ndk_main_MainActv_DEFAULT_KEYS_DISABLE
#define ndk_main_MainActv_DEFAULT_KEYS_DISABLE 0L
#undef ndk_main_MainActv_DEFAULT_KEYS_DIALER
#define ndk_main_MainActv_DEFAULT_KEYS_DIALER 1L
#undef ndk_main_MainActv_DEFAULT_KEYS_SHORTCUT
#define ndk_main_MainActv_DEFAULT_KEYS_SHORTCUT 2L
#undef ndk_main_MainActv_DEFAULT_KEYS_SEARCH_LOCAL
#define ndk_main_MainActv_DEFAULT_KEYS_SEARCH_LOCAL 3L
#undef ndk_main_MainActv_DEFAULT_KEYS_SEARCH_GLOBAL
#define ndk_main_MainActv_DEFAULT_KEYS_SEARCH_GLOBAL 4L
/*
 * Class:     ndk_main_MainActv
 * Method:    msgFromNDK
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_ndk_main_MainActv_msgFromNDK
  (JNIEnv *, jobject, jint);

/*
 * Class:     ndk_main_MainActv
 * Method:    get_Number
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_ndk_main_MainActv_get_1Number
  (JNIEnv *, jobject);

#ifdef __cplusplus
}
#endif
#endif
