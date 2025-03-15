import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.passmanager.R
import com.example.passmanager.fragments.pass.Password

class PasswordAdapter(private val passwordList: List<Password>) :
    RecyclerView.Adapter<PasswordAdapter.PasswordViewHolder>() {

    class PasswordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val companyTextView: TextView = itemView.findViewById(R.id.emailCompany)
        val passwordTextView: TextView = itemView.findViewById(R.id.passwordTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasswordViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pass, parent, false)
        return PasswordViewHolder(view)
    }

    override fun onBindViewHolder(holder: PasswordViewHolder, position: Int) {
        val passwordItem = passwordList[position]
        holder.nameTextView.text = passwordItem.name
        holder.companyTextView.text = passwordItem.emailCompany
        holder.passwordTextView.text = "******" // Скрываем пароль
    }

    override fun getItemCount() = passwordList.size
}
