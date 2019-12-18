import java.io.File;
import java.io.FileWriter;
public class Cliente {
	private String nome;
	private String email;
	private int cpf;
	private int rg;
	private String org_exp;
	private int cep;
	private String endereco;
	private String bairro;
	private int num;
	private String estado;
	private String cidade;
	private int telfixo;
	private int celular;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}


	public String getOrg_exp() {
		return org_exp;
	}


	public void setOrg_exp(String org_exp) {
		this.org_exp = org_exp;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public int getTelfixo() {
		return telfixo;
	}


	public void setTelfixo(int telfixo) {
		this.telfixo = telfixo;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public String salvar() {
		File f1 = new File("D:\\Dados");

		if(!f1.exists()) {
			try {
				f1.createNewFile();
				FileWriter writer = Filewrite(f1);
				writer.write(this.nome + "-" + this.email + "-" + this.cpf + "-" + this.rg + "-" + this.cidade + "-" + this.bairro + "-" + this.endereco + "-" + this.celular + "-" + this.telfixo );
				writer.flush();
				writer.close();
			
			} catch(Exception ex) {
				return "Erro ao criar o arquivo. Msg: " + ex.getMessage();
			}
		}
		return "Arquivo criado com sucesso!";
	}


	private FileWriter Filewrite(File f1) {
		// TODO Auto-generated method stub
		return null;
	}
}
