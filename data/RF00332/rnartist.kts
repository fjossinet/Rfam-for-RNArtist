import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00332"
            name = "consensus"
            use alignment numbering
        }
    }
    theme {
        details { 
            value = 3
        }

        color {
            location {
                1 to 10
                101 to 110
            }
            value = "#aeddd8"
        }



        color {
            location {
                11 to 100
            }
            value = "#e65989"
        }



    }
}           