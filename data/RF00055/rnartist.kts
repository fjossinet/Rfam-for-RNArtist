import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00055"
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
                1 to 5
                101 to 105
            }
            value = "#d23f9b"
        }



        color {
            location {
                6 to 100
            }
            value = "#ec21a6"
        }



    }
}           