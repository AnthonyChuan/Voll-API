package med.voll.api.Domain.Medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.Domain.Direccion.DatosDireccion;

public record DatosActualizarMedico(
        @NotNull
        Long id,
        String nombre,
        String documento,
        DatosDireccion direccion
) {
}
