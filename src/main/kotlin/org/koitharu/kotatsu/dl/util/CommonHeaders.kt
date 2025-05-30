package org.koitharu.kotatsu.dl.util

import okhttp3.CacheControl

object CommonHeaders {

	const val REFERER = "Referer"
	const val USER_AGENT = "User-Agent"
	const val ACCEPT = "Accept"
	const val CONTENT_TYPE = "Content-Type"
	const val CONTENT_DISPOSITION = "Content-Disposition"
	const val COOKIE = "Cookie"
	const val CONTENT_ENCODING = "Content-Encoding"
	const val ACCEPT_ENCODING = "Accept-Encoding"
	const val AUTHORIZATION = "Authorization"
	const val CACHE_CONTROL = "Cache-Control"
	const val PROXY_AUTHORIZATION = "Proxy-Authorization"
	const val RETRY_AFTER = "Retry-After"

	val CACHE_CONTROL_NO_STORE: CacheControl
		get() = CacheControl.Builder().noStore().build()
}
