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

JNIEXPORT jintArray JNICALL
Java_ndk_main_MainActv_add_1Array
  (JNIEnv *env, jobject thiz, jintArray source) {

	jint size = sizeof(source) / sizeof(source[0]);

	jint ret[1];

	ret[0] = size;

	jintArray newArray = env->NewIntArray(1);
//	jintArray newArray = (*env)->NewIntArray(env, 1);

	env->SetIntArrayRegion(newArray, 0, 1, ret);
//	(*env)->SetIntArrayRegion(env, newArray, 0, 1, ret);

//	newArray[0] = size;

	return newArray;

//	int ary[] = {size};

//	return ary;

}//Java_ndk_main_MainActv_add_1Array
