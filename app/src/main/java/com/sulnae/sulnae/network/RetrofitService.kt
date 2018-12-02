package plantopia.sungshin.plantopia.User

import com.google.gson.GsonBuilder
import com.sulnae.sulnae.network.ServerUrl
import com.sulnae.sulnae.network.ServiceApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    var service: ServiceApi = buildService()
    private var baseUrl: String = ""

    fun getInstance(): ServiceApi = service

    private fun buildService(): ServiceApi {
        baseUrl = String.format("http://%s:%d", ServerUrl.url, 3000)
        val gson = GsonBuilder().create()

        val factory = GsonConverterFactory.create(gson)

        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(factory)
                .build()
                .create<ServiceApi>(ServiceApi::class.java)
    }
}
