#include <jni.h>

#include <assert.h>
#include <ndksample.hpp>
/*
 * Class:     ndk_main_MainActv
 * Method:    msgFromNDK
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL
Java_ndk_main_MainActv_msgFromNDK
  (JNIEnv *env, jobject thiz, jint count) {

	const char *capital[] = { "東京", "ワシントン", "ロンドン", "パリ", "モスクワ", "北京" };

	jstring jstr = env->NewStringUTF(capital[count]);

	assert(jstr);

	return jstr;

}//Java_ndk_main_MainActv_msgFromNDK

JNIEXPORT jint JNICALL
Java_ndk_main_MainActv_get_1Number
  (JNIEnv *env, jobject thiz) {

	return 8;

}//Java_ndk_main_MainActv_get_1Number
