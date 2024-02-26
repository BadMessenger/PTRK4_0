package com.example.ptrk12


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ActionMenuView
import android.widget.TextView
import androidx.core.graphics.component2
import com.example.ptrk12.databinding.ActivityMainBinding


data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likedByMe: Boolean = false,
    var likes: Int
)



class MainActivity : AppCompatActivity() {
    var b = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = Post(
            id = 1,
            author = "Нетология Университет интернет...",
            content = "Привет, 123 321 фаыфвпа ыфпыфщзшпфы впрфызшп фышпргыфшщпфы пфрышпфрыгп ышпгр фопх фыпошыфпцшп ф пызп фщышпо щфпзщ шо.",
            published = "21 мая в 00:00",
            likedByMe = false,
            likes = 999

        )
        with(binding) {
            textView8.text = post.likes.toString()
            textView5.text = post.author
            textView7.text = post.content
            textView6.text = post.published
            if (post.likedByMe) {
                imageButton19.setImageResource(R.drawable.like0n)

            }
            imageButton19.setOnClickListener {
                post.likedByMe = !post.likedByMe
                imageButton19.setImageResource(
                    if (post.likedByMe){
                        R.drawable.like0n

                    } else {
                        R.drawable.like0ff

                    }
                )
            }

            imageButton19?.setOnClickListener {

                post.likedByMe = !post.likedByMe
                imageButton19.setImageResource(
                    if (post.likedByMe) R.drawable.like0n else R.drawable.like0ff
                )
                if (post.likedByMe) {
                    post.likes++

                }
                else {
                    post.likes--
                }
                textView8.text = post.likes.toString()

            }
        }
    }
    var r = 1998
    fun Podel(view: View) {
        val textView9: TextView = findViewById(R.id.textView9)
        textView9.text = r.toString()
        r++
        /*if(r>999){
            val t = r.toString()
            val e = t.take(2)
            val y = "${e[0]}.${e[1]} k"
            textView9.text = y.toString()
        }*/
        textView9.text = r.toString()



    }

    fun LikeClick(view: View) {}
}









