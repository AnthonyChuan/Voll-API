package med.voll.api.Domain.Medico;

public record DatosListadoMedico(
        Long Id,
        String nombre,
        String especialidad,
        String documentos,
        String email
) {
    public DatosListadoMedico(Medico medico){
        this(medico.getId(),medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(),medico.getEmail());
    }
}
