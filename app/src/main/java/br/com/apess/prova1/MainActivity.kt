package br.com.apess.prova1


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHumor.setOnClickListener {
            calcHumor()
        }




        sbHumor.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                    result.text = (progress.toString())


            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {


               result.text = (seekBar?.progress.toString())

            }


        }


       )

    }

    private fun calcHumor(){
        var humor = sbHumor.progress

        if ( humor >=0 && humor <= 3) {

            result2.text =  "  Triste "
            imgHumor.visibility = View.VISIBLE
            imgHumor.setImageResource(R.drawable.triste)

            Toast.makeText(this,"O Grownler esta Cheio!!!", Toast.LENGTH_SHORT).show()


        }else if (humor >= 4 && humor <= 6){

            result2.text =  "  Normal "
            imgHumor.visibility = View.VISIBLE
            imgHumor.setImageResource(R.drawable.normal)

        }else if (humor >= 7){

            result2.text =  "  Feliz  "
            imgHumor.visibility = View.VISIBLE
            imgHumor.setImageResource(R.drawable.feliz)
        }
    }


}



