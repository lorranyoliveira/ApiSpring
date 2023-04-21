package med.voll.api.medico;

public record ListagemMedico(Long id, String name, String email, String crm, Especialidade especialidade) {
    public ListagemMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }

}
