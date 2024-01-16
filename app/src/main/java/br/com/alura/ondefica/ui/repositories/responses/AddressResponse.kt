package br.com.alura.ondefica.ui.repositories.responses

import br.com.alura.ondefica.ui.uistates.AddressFormUiState
import com.squareup.moshi.Json
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AddressResponse(
    private val logradouro: String,
    private val bairro: String,
    @SerialName("localidade")
    @field:Json(name = "localidade")
    private val cidade: String,
    @SerialName("uf")
    @field:Json(name = "uf")
    private val estado: String
) {
    fun toAddressFormUiState() = AddressFormUiState(
        logradouro = logradouro,
        bairro = bairro,
        cidade = cidade,
        estado = estado,
        isLoading = false,
        isError = false
    )
}
