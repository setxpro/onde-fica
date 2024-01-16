package br.com.alura.ondefica.network

import br.com.alura.ondefica.ui.repositories.responses.AddressResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface AddressService {
    @GET("{cep}/json")
    suspend fun findAddress(@Path("cep") cep: String): AddressResponse
}