//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: jar:file:/Users/lauris/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.3.1/563dcb685903c96ce8abbd03adf7fa49e19aa8b4/gson-2.3.1-sources.jar!com/google/gson/TypeAdapterFactory.java
//

#ifndef _TypeAdapterFactory_H_
#define _TypeAdapterFactory_H_

#include "J2ObjC_header.h"

@class ComGoogleGsonGson;
@class ComGoogleGsonReflectTypeToken;
@class ComGoogleGsonTypeAdapter;

@protocol ComGoogleGsonTypeAdapterFactory < NSObject, JavaObject >

- (ComGoogleGsonTypeAdapter *)createWithComGoogleGsonGson:(ComGoogleGsonGson *)gson
                        withComGoogleGsonReflectTypeToken:(ComGoogleGsonReflectTypeToken *)type;

@end

J2OBJC_EMPTY_STATIC_INIT(ComGoogleGsonTypeAdapterFactory)

J2OBJC_TYPE_LITERAL_HEADER(ComGoogleGsonTypeAdapterFactory)

#endif // _TypeAdapterFactory_H_
